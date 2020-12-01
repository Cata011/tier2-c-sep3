package group2.tier2csep3.controllers;

import group2.tier2csep3.model.component.Component;
import group2.tier2csep3.model.component.ComponentList;
import group2.tier2csep3.service.componentService.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComponentsController {

    @Autowired
    ComponentService componentService;

    @GetMapping("/components")
    public ComponentList getAllComponents()
    {
        return componentService.getAllComponents();
    }

    @PostMapping("/components")
    public void addNewComponent(@RequestBody Component component)
    {
        System.out.println(component.toString());
        componentService.addNewComponent(component);
    }

}
