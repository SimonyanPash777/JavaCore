package chapters.chapters8.box;

class Box {
    double width;
    double height;
    double depth;

    Box(Box Ob) {
        width = Ob.width;
        height = Ob.height;
        depth = Ob.depth;
    }


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }


    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}


