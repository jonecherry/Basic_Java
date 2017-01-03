package tree;

/**
 * Created by qsong on 2017/1/3.
 */
public class shu {

    void fanwen(BTree t){
        System.out.println(t.var);
    }
//    递归
    void prebianli(BTree t){
        if(t != null){
            fanwen(t);
            prebianli(t.lt);
            prebianli(t.rt);
        }

    }
    void midbianli(BTree t){
        if(t != null){
            midbianli(t.lt);
            fanwen(t);
            midbianli(t.rt);
        }
    }
    void houxubianli(BTree t){
        if(t != null){
            houxubianli(t.lt);
            houxubianli(t.rt);
            fanwen(t);
        }
    }

//    非递归实现

}
