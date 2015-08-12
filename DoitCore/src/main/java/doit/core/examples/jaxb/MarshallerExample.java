package doit.core.examples.jaxb;

import doit.core.entites.DoitAbstractTask;
import doit.core.entites.DoitProject;
import doit.core.entites.DoitTask;
import doit.core.entites.DoitUser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Created by almu0214 on 12.08.2015.
 *
 * TODO: Description here please!
 */
public class MarshallerExample {
    public static void main(String[] args) {
        DoitUser almaz = new DoitUser("Almaz");
        almaz.setFirstName("Almaz");
        almaz.setSecondName("Murzabekov");
        almaz.setEmail("muktaalmaz@yandex.ru");
        almaz.setPassword("my_secret_password");

        DoitProject firstProject = new DoitProject("First project");
        firstProject.setDescription("This is description for first project");
        DoitAbstractTask firstTaskFP = new DoitTask("First task for first project");
        DoitAbstractTask secondTaskFP = new DoitTask("Second task for first project");
        firstProject.addTask(firstTaskFP);
        firstProject.addTask(secondTaskFP);

        DoitProject secondProject = new DoitProject("Second project");
        secondProject.setDescription("This is description for second project");
        DoitAbstractTask firstTaskSP = new DoitTask("First task for second project");
        DoitAbstractTask secondTaskSP = new DoitTask("Second task for second project");
        firstProject.addTask(firstTaskSP);
        firstProject.addTask(secondTaskSP);


        almaz.addTask(firstProject);
        almaz.addTask(secondProject);

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(DoitUser.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(almaz, System.out);
        } catch (JAXBException e){
            System.out.println("Oooooooops! Something happen wrong :-(");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
