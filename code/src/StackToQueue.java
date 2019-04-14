/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 * Company公司<p>
 *
 * @author wang_
 * @since 2019/4/14 19:50
 */

import java.util.Stack;

/**
 * @package:PACKAGE_NAME
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-04-14 19:50
 * @version:V1.0
 **/

public class StackToQueue {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void add(Integer value) {
        //向stack1中添加元素
        stack1.push(value);
        System.out.println("添加元素成功");
    }

    public void remove() {
        //先判断stack2是否为空，不为空直接pop
        if (!stack2.isEmpty()) {
            stack2.pop();
            System.out.println("删除元素成功");
        } else if (!stack1.isEmpty() && stack2.isEmpty()) {//如果stack2为空，stack1不为了，将stack1的元素逐个压入stack2,然后再pop stack2
            while (!stack1.isEmpty()) {
                int val = stack1.pop();
                stack2.push(val);
            }
            stack2.pop();
            System.out.println("删除元素成功");
        } else {
            System.out.println("队列为空");
        }
    }

    public void printQueue(){
        if (stack1.isEmpty()&&stack2.isEmpty()){
            System.out.println("队列为空");
            return;
        }

        System.out.println("按存入顺序打印:");
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
        while (!stack1.isEmpty()){
            int val=stack1.pop();
            stack2.push(val);
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }


    public static void main(String[] args){
        StackToQueue stackToQueue=new StackToQueue();
        stackToQueue.add(10);
        stackToQueue.add(6);
        stackToQueue.add(9);
//        stackToQueue.printQueue();

        stackToQueue.remove();
//        stackToQueue.printQueue();

        stackToQueue.add(4);
        stackToQueue.add(7);
        stackToQueue.printQueue();
    }
}
