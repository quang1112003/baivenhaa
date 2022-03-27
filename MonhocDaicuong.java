package session4.Assignment4;

import Session4.Assignment4.Hehe;

import java.util.ArrayList;

public class MonhocDaicuong extends Monhoc{
    public ArrayList<Hehe> Class = new ArrayList<>();

    @Override
    void themLophoc(String name, int Soluonghocsinh) {
        for(Hehe p:Class){
            if(p.name == name){
                for(int i:p.Soluonghocsinh){
                    if(i == Soluonghocsinh)
                        return;
                }
                p.Soluonghocsinh.add(Soluonghocsinh);
                return;
            }
        }
        Class.add(new Hehe(name,Soluonghocsinh));

    }

    @Override
    void xoaLophoc(String name) {
        for(Hehe p:Class){
            if(p.name == name){
                Class.remove(p);
                return;
            }
        }
    }

    @Override
    void Sapxep() {
        String arr[] = new String[5];
        int []sl = new int[5];
        int i = 0, count = 0;
        for (Hehe p:Class){
            arr[i] = p.name;
            for (int s: p.Soluonghocsinh){
                sl[i] = s;
            }
            i ++;
            count ++;
        }
        for (i = 0; i < count; i ++){
            for (  int j = i +1; j < count; j++){
                if (sl[j] < sl[i]){
                    int a = sl[i];
                    sl[i] = sl[j];
                    sl[j] = a;
                }
                String c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
            }

        }
        for (i = 0; i < count; i++){
            System.out.println("\t "+arr[i] + "\t "+sl[i]);
        }
    }

    @Override
    void inDanhsach() {

    }
}
