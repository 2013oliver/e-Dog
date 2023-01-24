import java.util.*;

public class Dog_test {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		Dog my_dog = new Dog(1,"a");
		int n;
		System.out.println("欢迎来到狗狗模拟器!");
		System.out.println("[1]输入或更新狗狗的个人信息 [2]让狗狗坐 [3]让狗狗站 [4]往饭盆里装满狗粮 [5]让狗狗吃饭 [6]和狗狗玩 [7]输出狗狗个人信息 [8]退出");
		System.out.print("请输入你需要的操作:");
		n = cin.nextInt();
		while (n != 8){
			if (n == 1){
				System.out.print("请输入狗狗的名字:");
				String name = cin.next();
				System.out.print("请输入狗狗的年龄:");
				int age = cin.nextInt();
				my_dog.Name = name;
				my_dog.Age = age;
			} else if (n == 2) {
				my_dog.Sit_Down();
			} else if (n == 3) {
				my_dog.Stand_Up();
			} else if (n == 4) {
				my_dog.Fill_Bowl();
			} else if (n == 5) {
				my_dog.Eat();
			} else if (n == 7) {
				my_dog.Print_Dog();
			} else if (n == 6) {
				System.out.println("玩具如下:");
				System.out.println("[1]球 [2]毛绒玩具 [3]退出");
				Dog.Play play = new Dog.Play(1);
				int m;
				System.out.print("请输入需要和" + my_dog.Name + "玩的玩具:");
				m = cin.nextInt();
				while (m != 3){
					if (m == 1) {
						play.Ball();
					} else if (m == 2) {
						play.Stuffed_Toy();
					}
					System.out.print("请输入需要和" + my_dog.Name + "玩的玩具:");
					m = cin.nextInt();
				}
			}
			System.out.print("请输入你需要的操作:");
			n = cin.nextInt();
		}
	}
}