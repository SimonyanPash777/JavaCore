package chapters.chapters7.box;

public class BoxOverLoad {
    double width;
    double heigth;
    double depth;

    BoxOverLoad(BoxOverLoad overLoad){
        width = overLoad.width;
        heigth = overLoad.heigth;
        depth = overLoad.depth;
    }
    BoxOverLoad(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    BoxOverLoad(){
        width = -1;
        heigth = -1;
        depth = -1;
    }
    BoxOverLoad(double len){
        width = heigth = depth = len;
    }
    double volume() {
        return width * heigth * depth;
    }
}
