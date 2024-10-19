import fs from "fs";

const MODEL_TEMPLATE = (popcorn_type, level, color) => {
    return {
        "credit": "Made by Satisfy & Ninjdai",
        "parent": `cornexpansion:block/base_popcorn_tin/base_popcorn_tin_${level}`,
        "render_type": "minecraft:cutout",
        "textures": {
            "0": `cornexpansion:block/tin/${color}/${popcorn_type}_tin`,
            "particle": `cornexpansion:item/${popcorn_type}`
        }
    }
}

const BLOCKSTATE_TEMPLATE = (popcorn_type) => {
    const RVAL = {"variants": {}};
    for (let bites = 0; bites < 10; bites++) {
        for (const color of Object.keys(COLOR_ID_MAP)) {
            for (const facing of FACING){
                RVAL.variants[`bites=${bites},facing=${facing},color=${color}`] = {
                    "model": `cornexpansion:block/${popcorn_type}_tin/${color}/${popcorn_type}_tin_${(bites < 8) ? 8-bites : 1}`,
                    "y": FACING_MAP[facing]
                }
            }
        }
    }

    return RVAL;
}

const COLORED_TIN_RECIPE_TEMPLATE = (popcorn_type, color) => {
    return {
        "type": "minecraft:crafting_shapeless",
        "category": "food",
        "group": `${popcorn_type}_tin_dying`,
        "ingredients": [
            {
                "item": `cornexpansion:${popcorn_type}_tin`
            },
            {
                "item": `minecraft:${color}_dye`
            }
        ],
        "result": {
            "id": `cornexpansion:${popcorn_type}_tin`,
            "components": {
                "minecraft:base_color": color
            }
        }
    }
}

const COLORED_TIN_ITEM_TEMPLATE = (popcorn_type, color) => {
    return {
        "parent": "minecraft:item/generated",
        "textures": {
            "layer0": `cornexpansion:item/dyed_tin/${color}_${popcorn_type}_tin`
        }
    };
}

const COLORED_TIN_ITEM_OVERRIDE_TEMPLATE = (popcorn_type) => {
    const RVAL = {
        parent: "minecraft:item/generated",
        textures: {
            "layer0": `cornexpansion:item/${popcorn_type}_tin`
        },
        overrides: []
    };

    for (const color of Object.keys(COLOR_ID_MAP)) {
        RVAL.overrides.push({ "predicate": { "cornexpansion:tin_dye": COLOR_ID_MAP[color]/16 }, "model": `cornexpansion:item/dyed_tin/${color}_${popcorn_type}_tin` });
    }

    return RVAL;
}

const MAX_LEVEL = 8;
const POPCORN_TYPES = [
    "popcorn",
    "sweet_popcorn",
    "buttery_popcorn",
    "cheesy_popcorn",
    "candied_popcorn"
]

const COLORS = [
    "black",
    "blue",
    "brown",
    "cyan",
    "gray",
    "green",
    "light_blue",
    "light_gray",
    "lime",
    "magenta",
    "orange",
    "pink",
    "purple",
    "red",
    "white",
    "yellow"
]

const COLOR_ID_MAP = {
    "white": 0,
    "orange": 1,
    "magenta": 2,
    "light_blue": 3,
    "yellow": 4,
    "lime": 5,
    "pink": 6,
    "gray": 7,
    "light_gray": 8,
    "cyan": 9,
    "purple": 10,
    "blue": 11,
    "brown": 12,
    "green": 13,
    "red": 14,
    "black": 15
}

const FACING = ["north", "east", "south", "west"];
const FACING_MAP = {north: 0, east: 90, south: 180, west: 270};

function writeModel({model, popcorn_type, level, color}) {
    if(!model) return;
    const dir = `./output/models/block/${popcorn_type}_tin/${color}`;
    
    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${popcorn_type}_tin_${level}.json`, JSON.stringify(model, undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

function writeBlockstate(popcorn_type) {
    const dir = `./output/blockstates/`;

    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${popcorn_type}_tin.json`, JSON.stringify(BLOCKSTATE_TEMPLATE(popcorn_type), undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

function writeColoredTinRecipe(popcorn_type, color) {
    const dir = `./output/recipes/tin_coloring`;

    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${popcorn_type}_tin_${color}.json`, JSON.stringify(COLORED_TIN_RECIPE_TEMPLATE(popcorn_type, color), undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

function writeColoredTinOverride(popcorn_type) {
    const dir = `./output/models/item/`;

    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${popcorn_type}_tin.json`, JSON.stringify(COLORED_TIN_ITEM_OVERRIDE_TEMPLATE(popcorn_type), undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

function writeColoredTinItemModel(popcorn_type, color) {
    const dir = `./output/models/item/dyed_tin/`;

    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${color}_${popcorn_type}_tin.json`, JSON.stringify(COLORED_TIN_ITEM_TEMPLATE(popcorn_type, color), undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

for (let level = 1; level < MAX_LEVEL + 1; level++) {
    for (const popcorn_type of POPCORN_TYPES) {
        for (const color of COLORS) {
            writeModel({
                model: MODEL_TEMPLATE(popcorn_type, level, color),
                popcorn_type: popcorn_type,
                level: level,
                color: color
            });
        }
    }
}

for (const popcorn_type of POPCORN_TYPES) {
    writeBlockstate(popcorn_type);
    writeColoredTinOverride(popcorn_type);
    for (const color of COLORS) {
        writeColoredTinRecipe(popcorn_type, color);
        writeColoredTinItemModel(popcorn_type, color);
    }
}
