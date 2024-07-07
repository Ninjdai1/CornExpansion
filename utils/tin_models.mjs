import fs from "fs";

const MODEL_TEMPLATE = (popcorn_type, level) => {
    return {
        credit: "Made by Satisfy & Ninjdai",
        parent: "block/block",
        render_type: "minecraft:cutout",
        textures: {
            0: `cornexpansion:block/${popcorn_type}_tin`,
            particle: `cornexpansion:item/${popcorn_type}`
        },
        elements: [
            {
                from: [5, 0, 5],
                to: [11, 7, 11],
                rotation: {angle: 0, axis: "y", origin: [5, 0, 5]},
                faces: {
                    north: {"uv": [8, 9, 14, 16], "texture": "#0"},
                    east: {"uv": [14, 9, 8, 16], "texture": "#0"},
                    south: {"uv": [8, 9, 14, 16], "texture": "#0"},
                    west: {"uv": [14, 9, 8, 16], "texture": "#0"},
                    up: {"uv": [1, 1, 7, 7], "texture": "#0"},
                    down: {"uv": [0, 0, 1, 1], "texture": "#0"}
                }
            },
            {
                from: [4, 7, 4],
                to: [12, 9, 12],
                rotation: {"angle": 0, "axis": "y", "origin": [4, 7, 4]},
                faces: {
                    north: {"uv": [8, 0, 16, 2], "texture": "#0"},
                    east: {"uv": [8, 2, 16, 4], "texture": "#0"},
                    south: {"uv": [8, 4, 16, 6], "texture": "#0"},
                    west: {"uv": [8, 6, 16, 8], "texture": "#0"},
                    up: {"uv": [8, 8, 0, 0], "texture": "#0"},
                    down: {"uv": [8, 0, 0, 8], "texture": "#0"}
                }
            },
            {
                from: [11, 0, 5],
                to: [5, 9, 11],
                rotation: {"angle": 0, "axis": "y", "origin": [11, 0, 5]},
                faces: {
                    north: {"uv": [9, 0, 15, 2], "texture": "#0"},
                    east: {"uv": [9, 0, 15, 2], "texture": "#0"},
                    south: {"uv": [9, 0, 15, 2], "texture": "#0"},
                    west: {"uv": [9, 0, 15, 2], "texture": "#0"}
                }
            },
            {
                name: "food",
                from: [5, level, 5],
                to: [11, level, 11],
                rotation: {"angle": 0, "axis": "y", "origin": [5, 8, 5]},
                faces: {
                    up: {"uv": [1, 9, 7, 15], "texture": "#0"},
                    down: {"uv": [1, 9, 7, 15], "texture": "#0"}
                }
            }
        ],
        groups: [
            {
                name: "tin",
                origin: [0, 0, 0],
                color: 0,
                children: [0, 1, 2, 3]
            }
        ]
    }
}

const MAX_LEVEL = 8;
const POPCORN_TYPES = [
    "popcorn",
    "sweet_popcorn",
    "buttery_popcorn",
    "cheesy_popcorn",
    "candied_popcorn"
]

function writeModel({model, popcorn_type, level}) {
    if(!model) return;
    const dir = `./output/${popcorn_type}_tin`;
    
    if (!fs.existsSync(dir)){
        fs.mkdirSync(dir, { recursive: true });
    }
    fs.writeFile(`./${dir}/${popcorn_type}_tin_${level}.json`, JSON.stringify(model, undefined, 4), (err) => {
        if (err)
            console.log(err);
    });
}

for (let level = 1; level < MAX_LEVEL + 1; level++) {
    for (const popcorn_type of POPCORN_TYPES) {
        writeModel({
            model: MODEL_TEMPLATE(popcorn_type, level),
            popcorn_type: popcorn_type,
            level: level
        });
    }
}
