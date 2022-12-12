package Controllers;

import Dao.DossierDao;
import Dao.MedicamentDao;
import entities.Agent;
import entities.Medicament;
import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/dossier")
public class Dossier {
     @Autowired
    MedicamentDao med;
     @Autowired
     DossierDao Dossier;
    @GetMapping("/displayFolder")
    public ModelAndView display(){
        ModelAndView mv =new ModelAndView();

        System.out.println(Dossier.getAll(1).get(1));
        mv.addObject("folders",Dossier.getAll(1));
        mv.setViewName("displayDossier");
        return mv;
    }
    @GetMapping("/DisplayMedicament")
    public ModelAndView displayMed(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("medicament",med.getAll());
        mv.setViewName("addFolder");
        return mv;
    }
    @PostMapping("/addDossier")
    public ModelAndView addFolder(@RequestParam("description") String description, @RequestParam("idPateint") String idPateint, @RequestParam("medicament") String medicament){
        double rembouresement=0;
        String[] medicaments = medicament.split("-");
        List<Medicament> medicamentsList = new ArrayList<>();
        MedicamentDao med = new MedicamentDao();
        DossierDao doosier = new DossierDao();
        Agent agent = new Agent();
        Patient patient =  new Patient();
        entities.Dossier newDossier = new entities.Dossier();
        for(int i=0;i<medicaments.length;i++){
          System.out.println(Long.parseLong(medicaments[i]));
          System.out.println("test "+med.get(Long.parseLong(medicaments[i])).getRemboursement());
          rembouresement += med.get(Long.parseLong(medicaments[i])).getRemboursement();
           medicamentsList.add(med.get(Long.parseLong(medicaments[i])));
        }
        agent.setIduser(1);
        patient.setIduser(2);
        newDossier.setAgent(agent);
        newDossier.setMedicament(medicamentsList);
        newDossier.setDescription(description);
        newDossier.setRemboursement(rembouresement);
        newDossier.setStatus("pending");
        newDossier.setPatient(patient);
        doosier.save(newDossier);
        ModelAndView mv =new ModelAndView();
        mv.addObject("medicament",med.getAll());
        mv.setViewName("addFolder");
        return mv;
    }
    @PostMapping("/update")
    public ModelAndView update(@RequestParam("status") String status,@RequestParam("id") String id){
        DossierDao newDossier = new DossierDao();
        entities.Dossier dossier= newDossier.get(Long.parseLong(id));
        dossier.setStatus(status);
        newDossier.update(dossier);
        ModelAndView mv =new ModelAndView();
        mv.addObject("folders",newDossier.getAll(1));
        mv.setViewName("displayDossier");
        return mv;
    }



}
