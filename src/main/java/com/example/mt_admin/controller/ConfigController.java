package com.example.mt_admin.controller;

import com.example.mt_admin.DTO.ConfigDTO;
import com.example.mt_admin.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/config")
public class ConfigController {
    private final ConfigService configService;

    @Autowired
    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping()
    public String getConfigPage(Model model) {
        model.addAttribute("config", configService.getCurrent());
        return "config";
    }

    @PostMapping("/save")
    public String saveNewConfig(@ModelAttribute ConfigDTO newConfigDTO) {
        configService.saveNew(newConfigDTO);

        return "redirect:/";
    }

}
