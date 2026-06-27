package Phase1_DS.x1_Linear.String;

public class CRUD {
public static void main(String args[])
{
    //---- declaring a String-----
    String me="I";
    String sentence="I am";
    String introduction="I am Iron-Man";


            //----concatanation
    String intro= sentence+" BATMAN";
    System.out.println(intro);


    //-----Operations------
    System.out.println(intro.length());//length of the string (like it isn't obvious from name)


    for(int i=0;i<intro.length();i++)
    {
        System.out.print(intro.charAt(i)+",");//returns the character at a particular index
     }
    System.out.println();
        //---comparision---

    String name1= "Iron-man";
    String name2= "BATMAN";
if(name1.compareTo(name2)==0)
    System.out.print(name1+" is equall to "+name2);
else if(name1.compareTo(name2)>0)
    System.out.print(name1+" is greater than "+name2);
else if(name1.compareTo(name2)<0)
        System.out.print(name2+" is greater than "+name1);
//For Batman fan(Me Too),Java compares strings lexicographically (by ASCII/Unicode numerical values, where uppercase 'I' [73] is greater than uppercase 'B' [66]).
//== may does not always work due to.... to be continued in StringBuilder

//---- substring----

    //String VarName= string.substring(begining index,ending index)
    String hero=introduction.substring(5);//ending index is by default unless changed
System.out.println(hero);


    System.out.println(introduction.toUpperCase());
    System.out.println(introduction.toLowerCase());
}
}
// String is immutable
