package group2.tier2csep3.controllers;

import group2.tier2csep3.model.Component;
import group2.tier2csep3.model.ComponentList;
import group2.tier2csep3.service.ComponentService.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ComponentsController {

    @Autowired
    ComponentService componentService;

    @GetMapping("/components")
    public ComponentList getAllComponents()
    {
        return componentService.getAllComponents();
    }
}
