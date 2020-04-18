package cn.clinic.util;

import java.util.Collection;
import java.util.Map;


/**
 * 判断是否非空
 *
 * @author 强
 * @version 1.0
 * @since 2020/4/17
 */
public class EmptyUtil {

    /**
     * 判断非空
     *
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj) {
        //判断非空
        if (obj == null) {
            return true;
        }
        //判断字符是否为空
        if (obj instanceof CharSequence) {
            return ((CharSequence) obj).length() == 0 ? true : false;
        }
        //判断map集合是否为空
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        //Conllection 判断
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        //数组判断
        if (obj instanceof Object[]) {
            Object[] obj1 = (Object[]) obj;
            if (obj1.length == 0) {
                return true;
            }
            boolean empty = true;
            for (int i = 0; i < obj1.length; i++) {
                if (obj1[i] != null) {
                    empty = false;
                    break;
                }
            }
            return empty;
        }
        return false;
    }

    /**
     * 传入多个值判断
     *
     * @param objects
     * @return
     */
    public static boolean isEmptys(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (EmptyUtil.isEmpty(objects)) {
                return true;
            }
        }
        return false;
    }
}
