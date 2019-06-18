package com.bigfile.handle.util;

import java.util.*;

/**
 * @author WuLiangzhi  2019/06/18 8:32
 */
public class CollectionUtils
{
    /**
     * 判断指定对象是否是Map。
     *
     * @return true对象是Map，false对象不是Map。
     */
    public static boolean isMap (Object object)
    {
        return object instanceof Map< ? , ? >;
    }

    /**
     * 判断指定对象是否是可遍历的Iterable对象。
     *
     * @return true是，false不是。
     */
    public static boolean isIterable (Object object)
    {
        return object instanceof Iterable < ? >;
    }

    /**
     * 判断指定对象是否是数组。
     *
     * @return true对象是数组，false对象不是数组。
     */
    public static boolean isArray (Object object)
    {
        return object.getClass ().isArray ();
    }

    /**
     * 判断一个集合体是否为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isEmpty (Map < ? , ? > test)
    {
        return !isNotEmpty (test);
    }

    /**
     * 判断一个集合体是否为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isNotEmpty (Map < ? , ? > test)
    {
        return test != null && !test.isEmpty ();
    }

    /**
     * 判断一个集合体是否为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isEmpty (Collection< ? > test)
    {
        return !isNotEmpty (test);
    }

    /**
     * 判断一个集合体是否不为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isNotEmpty (Collection < ? > test)
    {
        return test != null && !test.isEmpty ();
    }

    /**
     * 判断一个集合体是否为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isEmpty (Object[] test)
    {
        return !isNotEmpty (test);
    }

    /**
     * 判断一个集合体是否不为空，包括NULL
     *
     * @param test 待测试集合体
     * @return
     */
    public static boolean isNotEmpty (Object[] test)
    {
        return test != null && test.length > 0;
    }

    /**
     * Translate Enumeration 为 List
     *
     * @param elements
     * @return
     */
    public static <V> List<V> asList (Enumeration<V> elements)
    {
        if (elements == null || !elements.hasMoreElements ())
        {
            return Collections.emptyList ();
        }
        List <V> copy = new ArrayList <V> ();
        for (; elements.hasMoreElements ();)
        {
            copy.add (elements.nextElement ());
        }
        return copy;
    }

    /**
     * Translate Set 为 List
     *
     * @param elements
     * @return
     */
    public static <V> List <V> asList (Set <V> elements)
    {
        if (elements == null || elements.isEmpty ())
        {
            return Collections.emptyList ();
        }
        return new ArrayList <V> (elements);
    }

    /**
     * 转化E数组为Set集合
     *
     * @param elements
     * @return
     */
    public static <E> Set <E> asSet (E... elements)
    {
        if (elements == null || elements.length == 0)
        {
            return Collections.emptySet ();
        }
        LinkedHashSet <E> set = new LinkedHashSet <E> (elements.length * 4 / 3 + 1);
        Collections.addAll (set, elements);
        return set;
    }

    /**
     * 转化E为List
     *
     * @param elements
     * @return
     */
    public static <E> List <E> asList (E... elements)
    {
        if (elements == null || elements.length == 0)
        {
            return Collections.emptyList ();
        }
        // Avoid integer overflow when a large array is passed in
        int capacity = (int) Math.min (5L + elements.length + (elements.length / 10), Integer.MAX_VALUE);
        ArrayList <E> list = new ArrayList <E> (capacity);
        Collections.addAll (list, elements);
        return list;
    }

    /**
     * 自定义的类型提取转换器
     * @author zousong 2017/03/27
     *
     * @param <K>
     * @param <T>
     */
    public interface Consumer <K, T>
    {
        /**
         * 根据k类型的对象，转换为T类型的对象<br>
         * 返回对象为空，则会被忽略
         * @param k
         * @return
         */
        T accept (K k);
    }

    /**
     * 将一个集合对象进行遍历，并按照规则提取数据重新构造成一个新的类型集合
     *
     * @param collection 待遍历的集合类型
     * @param action
     * @return
     */
    public static <K, T> List <T> convertEach (Collection <K> collection, Consumer <K, T> action)
    {
        // 转换器不能为空
        if (action == null) {
            throw new IllegalArgumentException("Consumer is not allow null.");
        }

        // 转换集合为空
        if (isEmpty (collection))
        {
            return Collections.emptyList ();
        }

        // 生成一个新的集合
        List <T> returnValues = new ArrayList <T> ();

        T v ;
        for (K k : collection)
        {
            v = action.accept (k);
            if (v == null)
            {
                continue;
            }
            returnValues.add (v);
        }

        return returnValues;
    }

    /**
     * 将一个集合对象转换成map对象
     * @param collection  对象集合
     * @param action  转换器
     * @param <K> 对象类型
     * @param <T>  返回map 键属性
     * @return
     */
    public static <K,T> Map<T,K> convertMap(Collection <K> collection, Consumer <K, T> action)
    {
        // 转换器不能为空
        if (action == null) {
            throw new IllegalArgumentException("Consumer is not allow null.");
        }

        // 转换集合为空
        if (isEmpty (collection))
        {
            return Collections.emptyMap();
        }

        Map<T,K> map = new HashMap<T, K>(collection.size());

        T t;
        for (K item :collection)
        {
            t =action.accept(item);
            map.put(t,item);
        }

        return map;
    }
}
