import java.io.FileNotFoundException;

public class Driver {
  public static void main(String[]args){
    String filename = "data1.dat";
    try{
      Maze f;
      f = new Maze(filename);//true animates the maze.

      f.setAnimate(false);//comment this if you are using windows cmd/powershell
      System.out.println(f.solve()+" steps");
      System.out.println(f);
    }catch(FileNotFoundException e){
      System.out.println("Invalid filename: "+filename);
    }
  }
}