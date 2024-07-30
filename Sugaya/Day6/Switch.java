public class Switch {
    public static void main(String[] args){
        int drink = 1;
        switch (drink){
            case 1:
                System.out.println("coffee");
                break;
            case 2:
                System.out.println("tea");
                break;
            default:
            //なぜデフォルトが必要なのか
            //どこにも入らないケースが出てくるので必ずdefaultは入れましょうね。
            //defaultになることが実際にないとしても必ずそのケース入れてね。
            //ifが入ったら必ずelseがあるか
            //if else ifがある場合、必ずelseがあること
                System.out.println("water");
                break;
        }
    }
}


//なぜスイッチ分があるのか、みやすいから？
//if elseでもかけるので不要では？
//項目がたくさんあるとswitch文を使う
//2-3こくらいの条件分岐であればif elseでは良いのでは？

//breakを忘れるとどうなるか
//breakがないと次の処理まで実行されてしまうよ
//breakは恣意的に外してます的な
//どういう時、1,２のいずれかの場合の処理など

//case自体を書くのを忘れないようにすること
//離散的な数字を入れるケースが多い、a,b,c 


//if文はなるべく使わないほうがいいは正しい。

// signedとunsignedについて
//go ruby javaのsigned と unsignedの表現の仕方