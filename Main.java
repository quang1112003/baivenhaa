package session4.Assignment4;
import Session4.Assignment4.Hehe;
public class Main {
    public static void main(String agrs[]){
        MonhocDaicuong mh = new MonhocDaicuong();
        mh.themLophoc("T2108M", 18);
        mh.themLophoc("T2109M", 20);
        mh.themLophoc( "T2110M", 22);
        mh.themLophoc( "T2111M", 12);


        for (Hehe l : mh.Class){
            System.out.println("\t Name:"+l.name + "\n \t So hoc sinh:" +l.Soluonghocsinh);
        }
        System.out.println("\t\t |||");

        mh.xoaLophoc("T2109M");
        for (Hehe l: mh.Class){
            System.out.println("\t Name:"+l.name);
        }
        System.out.println("\t\t |||");
        mh.Sapxep();

    }
}