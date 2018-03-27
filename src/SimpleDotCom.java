public class SimpleDotCom {
    int[] locationCells;
    int numOfHits=0;
    public void setLocationCells(int[] locs){
        locationCells=locs;
    }
    public String checkYourself(String stringGuess){
        //把字符串转换成int
        int guess=Integer.parseInt(stringGuess);
        //创建出保存返回结果的变量。以miss作为默认值
        String result="miss";
        //以循环对每个格子重复执行
        for (int cell:locationCells){
            //比较格子与猜测值
            if (guess==cell){//如果猜中
                result="hit";//命中
                numOfHits++;//递增命中数
                break;//已经离开循环，但需要判断是否击沉
            }//end if
        }//end for
        //如果命中数为3，则返回击沉信息
        if (numOfHits==locationCells.length){
            result="kill";
        }//end if 
        System.out.println(result);//将结果显示出来
        return result;//将结果返回给调用方
    }//end method
}
