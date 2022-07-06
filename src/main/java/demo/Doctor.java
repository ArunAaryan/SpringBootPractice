package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// to use custom scope the class has to be annotated with @Component and no custom beans on config class
//@Scope(scopeName = "singleton")
@Scope(scopeName = "prototype")
public class Doctor implements Staff {

    @Override
    public String toString(){
        return "Doctor{" + "qualification='" + qualification +'\'' + '}';
    }

    private String qualification;
    public  void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
