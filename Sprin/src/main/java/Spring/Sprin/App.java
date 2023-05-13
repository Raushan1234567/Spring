package Spring.Sprin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       ApplicationContext app= new ClassPathXmlApplicationContext("p.xml");
      Student s1= (Student) app.getBean("stu1");
      System.out.println(s1);
        
    }
}
