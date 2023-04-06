package itheima.java1.d07_oneclass.classarray.student;

/**
 * @project: 学术类测试
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    static int size = 3;

    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象并加入数组
        Student s1 = new Student("001", "张三", 18);
        Student s2 = new Student("002", "李四", 18);
        Student s3 = new Student("003", "王五", 18);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //再次添加一个学生对象，并判断学号是否已经存在
        Student s4 = new Student("004", "赵六", 18);
        inputArr(students, s4);

        //遍历学生信息
        print(students);
        //删除学生
        delete(students, "005");
        delete(students, "004");

        //删除之后遍历学生信息
        print(students);

    }

    /**
     * 删除学生信息
     *
     * @param arr
     * @param id
     */
    public static void delete(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNo().equals(id)) {
                //id存在，删除学生
                arr[i] = arr[arr.length - 1];
                break;
            } else {
                System.out.println("删除失败，该学生不存在");
            }
        }
    }


    /**
     * 打印学生信息
     *
     * @param arr
     */
    public static void print(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }

    /**
     * 添加学生信息
     *
     * @param arr
     * @param s
     */
    public static void inputArr(Student[] arr, Student s) {
        //如果数组已满
        if (arr[arr.length - 1] != null) {
            //数组扩容
            //临时数组
            Student[] temp = arr;
            //重新创建数组
            arr = new Student[4];
            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
        }
        //判断新添加的学生的编号是否已经存在
        if (contains(arr, s.getNo())) {
            System.out.println("该学号已经存在");
        } else {
            arr[3] = s;
        }
    }

    /**
     * 判断学号是否已经存在
     *
     * @param arr
     * @param str
     * @return
     */
    public static boolean contains(Student[] arr, String str) {
        for (int i = 0; i < size; i++) {
            if (arr[i].getNo().equals(str)) {
                return true;
            }
        }
        return false;
    }


}
