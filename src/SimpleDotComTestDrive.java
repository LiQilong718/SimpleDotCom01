/**
测试类
**/

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;//记录玩家猜测次数的变量
        GameHelper helper = new GameHelper();//这个类用来取得玩家的输入

        SimpleDotCom theDotCom = new SimpleDotCom();//创建dot com对象
        //用随机数产生第一格的位置，然后以此制作出数组
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);//赋值位置
        //创建出记录游戏是否继续进行的boolean变量，这会用在while循环中
        boolean isAlive = true;
        while (isAlive == true) {
            //取得玩家输入的字符串
            String guess = helper.getUserInput("enter a number");
            //检查玩家的猜测并将结果存储在String中
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            //判断是否击沉，如果是，则设定isAlive为false并打印出猜测次数
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you tool " + numOfGuesses + " guesses");
            }//close if
        }//close while


    }//close main
}

