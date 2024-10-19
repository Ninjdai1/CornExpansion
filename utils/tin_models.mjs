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
        for (const color of COLORS) {
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

const FACING = ["north", "east", "south", "west"];
const FACING_MAP = {north: 0, east: 90, south: 180, west: 270};

function writeModel({model, popcorn_type, level, color}) {
    if(!model) return;
    const dir = `./output/models/${popcorn_type}_tin/${color}`;
    
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
}
