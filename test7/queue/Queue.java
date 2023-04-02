package com.lanqiao.javalearn.java1.test7.queue;

public class Queue {

    int size;       //元素个数
    int[] element;  //存储元素


    //无参构造
    public Queue() {

        this.element = new int[8];

        this.size = 0;
    }

    /**
     * enqueue(int v)，用于将 v 加入到队列中
     */
    public void enqueue(int v) {

        //如果队列已经满了
        if (size == element.length) {
            resize(element.length * 2);
        }

        element[size++] = v;
    }

    /**
     * 方法 resize()，用于扩展队列容量。
     *
     * @return
     */
    public void resize(int newSize) {

        //临时数组
        int[] temp = element;

        element = new int[newSize];

        for(int i = 0;i < size;i ++){
            element[i] = temp[i];
        }


    }

    /**
     * 方法 dequeue()，用于从队列中移除元素并返回该元素。
     *
     * @return
     */
    public int dequeue() {

        //队列先进先出
        int temp = element[0];

        //将后面数据往前移
        for (int i = 1;i < size;i ++){
            element[i - 1] = element[i];
        }

        size --;

        return temp;
    }

    /**
     * 方法 empty()，如果队列是空的话，该方法返回 true。
     *
     * @return
     */
    public boolean empty() {

        return size == 0;
    }

    /**
     * @return the size
     */
    public int getSize() {

        return size;
    }
}
