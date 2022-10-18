package ru.mephi.java.ch06.sec14;

import java.util.ArrayList;

public class Closer {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        Exception resException = null;
        for (T elem : elems) {
//            try {
//                elem.close();
//            }
//            catch (Exception e) {
//                if (resException == null)
//                    resException = e;
//                else
//                    //chain
//                    resException = new Exception(resException);
//            }
            Exception e = new Exception("Wow! Exception!");
            if (resException == null)
                    resException = e;
            else
                //chain
                resException = new Exception(resException);
        }

        if (resException != null)
            throw resException;
    }
}
