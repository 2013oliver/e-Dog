public class Dog {
    public int Age;
	public static int c = 5;
    public static String Name;
    public boolean Is_sit;
    public boolean Is_bowl_empty = true;
    public static boolean Is_dog_full;
	public int snack = 200;
	public static int money = 100;

    public Dog(int age,String name){
        Age = age;
        Name = name;
    }
    public void Sit_Down(){
        Is_sit = true;
        System.out.println(Name + "已坐下.");
    }
    public void Stand_Up(){
        Is_sit = false;
        System.out.println(Name + "站了起来.");
    }
    public void Fill_Bowl(){
        Is_bowl_empty = false;
        System.out.println("你往" + Name + "的碗里装满了狗粮,可以让" + Name + "吃饭了.");
    }
	public static class Play {
		int x;
		public Play(int x){
			this.x = x;
		}
		public void Ball(){
			if (c == 0) {
				if (Is_dog_full) {
					System.out.println(Name + "玩累了,给它吃点零食可以恢复两次玩的次数!");
				} else {
					System.out.println(Name + "玩累了,给它吃东西可以恢复能量!");
				}
			} else {
				c--;
				money += 2;
				System.out.println("你和" + Name + "玩球," +  Name + "很开心!!");
				System.out.println("游戏币+2");
			}
		}
		public void Stuffed_Toy(){
			if (c == 0) {
				if (Is_dog_full) {
					System.out.println(Name + "玩累了,给它吃点零食可以恢复两次玩的次数!");
				} else {
					System.out.println(Name + "玩累了,给它吃东西可以恢复能量!");
				}
			} else {
				c--;
				money += 2;
				System.out.println(Name + "在玩毛绒玩具," + Name + "很开心!!");
				System.out.println("游戏币+2");
			}
		}
	}
    public void Eat() {
	    if (Is_bowl_empty) {
		    System.out.println("饭盆现在空了,你需要往饭盆里装满狗粮!!");
	    } else if (Is_dog_full) {
		    System.out.println(Name + "已经吃饱了,再给它吃它会撑的!");
	    } else {
		    Is_bowl_empty = true;
		    System.out.println(Name + "吃饱了,它很开心.");
		    Is_dog_full = true;
		    c += 5;
		    money += 3;
		    System.out.println("游戏币+3");
	    }
    }
	public void Eat_Snack() {
		if (snack != 0) {
			snack -= 10;
			c += 2;
			System.out.println(Name + "吃了一点零食,还剩" + snack / 100 + "盒零食!");
			money ++;
			System.out.println("游戏币+1");
		} else {
			System.out.println("没零食了,去商店买一点零食吧!");
		}
	}
    public void Print_Dog(){
        System.out.println("名字:" + Name);
        System.out.println("年龄:" + Age);
		System.out.println("游戏币:" + money);
        if (Is_sit){
            System.out.println(Name + "现在是坐的状态");
        } else {
            System.out.println(Name + "现在是站的状态");
        }
        if (Is_dog_full){
            System.out.println(Name + "饱了");
        } else {
            System.out.println(Name + "没有吃东西");
        }
        if (Is_bowl_empty){
            System.out.println("饭碗里是空的");
        } else {
            System.out.println("饭碗里是满的");
        }
	    System.out.println("还有" + snack / 100 + "盒零食!");
    }
}