package dk.aivclab.demo.usecases.detection.categories;

public class MsCoco {
  public static String[] labels = new String[]{"unlabeled",
                                               "person",
                                               "bicycle",
                                               "car",
                                               "motorcycle",
                                               "airplane",
                                               "bus",
                                               "train",
                                               "truck",
                                               "boat",
                                               "traffic light",
                                               "fire hydrant",
                                               "street sign",
                                               "stop sign",
                                               "parking meter",
                                               "bench",
                                               "bird",
                                               "cat",
                                               "dog",
                                               "horse",
                                               "sheep",
                                               "cow",
                                               "elephant",
                                               "bear",
                                               "zebra",
                                               "giraffe",
                                               "hat",
                                               "backpack",
                                               "umbrella",
                                               "shoe",
                                               "eye glasses",
                                               "handbag",
                                               "tie",
                                               "suitcase",
                                               "frisbee",
                                               "skis",
                                               "snowboard",
                                               "sports ball",
                                               "kite",
                                               "baseball bat",
                                               "baseball glove",
                                               "skateboard",
                                               "surfboard",
                                               "tennis racket",
                                               "bottle",
                                               "plate",
                                               "wine glass",
                                               "cup",
                                               "fork",
                                               "knife",
                                               "spoon",
                                               "bowl",
                                               "banana",
                                               "apple",
                                               "sandwich",
                                               "orange",
                                               "broccoli",
                                               "carrot",
                                               "hot dog",
                                               "pizza",
                                               "donut",
                                               "cake",
                                               "chair",
                                               "couch",
                                               "potted plant",
                                               "bed",
                                               "mirror",
                                               "dining table",
                                               "window",
                                               "desk",
                                               "toilet",
                                               "door",
                                               "tv",
                                               "laptop",
                                               "mouse",
                                               "remote",
                                               "keyboard",
                                               "cell phone",
                                               "microwave",
                                               "oven",
                                               "toaster",
                                               "sink",
                                               "refrigerator",
                                               "blender",
                                               "book",
                                               "clock",
                                               "vase",
                                               "scissors",
                                               "teddy bear",
                                               "hair drier",
                                               "toothbrush",
                                               "hair brush",
                                               "banner",
                                               "blanket",
                                               "branch",
                                               "bridge",
                                               "building-other",
                                               "bush",
                                               "cabinet",
                                               "cage",
                                               "cardboard",
                                               "carpet",
                                               "ceiling-other",
                                               "ceiling-tile",
                                               "cloth",
                                               "clothes",
                                               "clouds",
                                               "counter",
                                               "cupboard",
                                               "curtain",
                                               "desk-stuff",
                                               "dirt",
                                               "door-stuff",
                                               "fence",
                                               "floor-marble",
                                               "floor-other",
                                               "floor-stone",
                                               "floor-tile",
                                               "floor-wood",
                                               "flower",
                                               "fog",
                                               "food-other",
                                               "fruit",
                                               "furniture-other",
                                               "grass",
                                               "gravel",
                                               "ground-other",
                                               "hill",
                                               "house",
                                               "leaves",
                                               "light",
                                               "mat",
                                               "metal",
                                               "mirror-stuff",
                                               "moss",
                                               "mountain",
                                               "mud",
                                               "napkin",
                                               "net",
                                               "paper",
                                               "pavement",
                                               "pillow",
                                               "plant-other",
                                               "plastic",
                                               "platform",
                                               "playingfield",
                                               "railing",
                                               "railroad",
                                               "river",
                                               "road",
                                               "rock",
                                               "roof",
                                               "rug",
                                               "salad",
                                               "sand",
                                               "sea",
                                               "shelf",
                                               "sky-other",
                                               "skyscraper",
                                               "snow",
                                               "solid-other",
                                               "stairs",
                                               "stone",
                                               "straw",
                                               "structural-other",
                                               "table",
                                               "tent",
                                               "textile-other",
                                               "towel",
                                               "tree",
                                               "vegetable",
                                               "wall-brick",
                                               "wall-concrete",
                                               "wall-other",
                                               "wall-panel",
                                               "wall-stone",
                                               "wall-tile",
                                               "wall-wood",
                                               "water-other",
                                               "waterdrops",
                                               "window-blind",
                                               "window-other",
                                               "wood"
  };

  public static String[] labels_2014_2017 = new String[]{"person",
                                                         "bicycle",
                                                         "car",
                                                         "motorcycle",
                                                         "airplane",
                                                         "bus",
                                                         "train",
                                                         "truck",
                                                         "boat",
                                                         "traffic light",
                                                         "fire hydrant",
                                                         "stop sign",
                                                         "parking meter",
                                                         "bench",
                                                         "bird",
                                                         "cat",
                                                         "dog",
                                                         "horse",
                                                         "sheep",
                                                         "cow",
                                                         "elephant",
                                                         "bear",
                                                         "zebra",
                                                         "giraffe",
                                                         "backpack",
                                                         "umbrella",
                                                         "handbag",
                                                         "tie",
                                                         "suitcase",
                                                         "frisbee",
                                                         "skis",
                                                         "snowboard",
                                                         "sports ball",
                                                         "kite",
                                                         "baseball bat",
                                                         "baseball glove",
                                                         "skateboard",
                                                         "surfboard",
                                                         "tennis racket",
                                                         "bottle",
                                                         "wine glass",
                                                         "cup",
                                                         "fork",
                                                         "knife",
                                                         "spoon",
                                                         "bowl",
                                                         "banana",
                                                         "apple",
                                                         "sandwich",
                                                         "orange",
                                                         "broccoli",
                                                         "carrot",
                                                         "hot dog",
                                                         "pizza",
                                                         "donut",
                                                         "cake",
                                                         "chair",
                                                         "couch",
                                                         "potted plant",
                                                         "bed",
                                                         "dining table",
                                                         "toilet",
                                                         "tv",
                                                         "laptop",
                                                         "mouse",
                                                         "remote",
                                                         "keyboard",
                                                         "cell phone",
                                                         "microwave",
                                                         "oven",
                                                         "toaster",
                                                         "sink",
                                                         "refrigerator",
                                                         "book",
                                                         "clock",
                                                         "vase",
                                                         "scissors",
                                                         "teddy bear",
                                                         "hair drier",
                                                         "toothbrush"
  };

  public static int[] colors = new int[]{0xFF3CB371,
                                         0xFFFFE4B5,
                                         0xFFFF1493,
                                         0xFF800080,
                                         0xFF87CEEB,
                                         0xFFF0FFFF,
                                         0xFFA52A2A,
                                         0xFF8A2BE2,
                                         0xFF228B22,
                                         0xFFFF00FF,
                                         0xFFFF69B4,
                                         0xFF696969,
                                         0xFF20B2AA,
                                         0xFF7FFF00,
                                         0xFF90EE90,
                                         0xFF708090,
                                         0xFFB8860B,
                                         0xFFD3D3D3,
                                         0xFF00FA9A,
                                         0xFFFFDEAD,
                                         0xFFFA8072
  };


}
