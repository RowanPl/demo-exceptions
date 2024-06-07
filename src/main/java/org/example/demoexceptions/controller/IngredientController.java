package org.example.demoexceptions.controller;

import jakarta.validation.Valid;
import org.example.demoexceptions.dto.input.IngredientInputDto;
import org.example.demoexceptions.dto.output.IngredientOutputDto;
import org.example.demoexceptions.exceptions.RecordNotFoundException;
import org.example.demoexceptions.service.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public ResponseEntity<IngredientOutputDto> createIngredient(@Valid @RequestBody IngredientInputDto ingredientInputDto, BindingResult br) {
        //Convert this part to a helper class
        try {
            if (br.hasFieldErrors()) {
                StringBuilder sb = new StringBuilder();
                for (FieldError fe : br.getFieldErrors()) {
                    sb.append(fe.getField());
                    sb.append(" : ");
                    sb.append(fe.getDefaultMessage());
                    sb.append("\n");
                }
                throw new RecordNotFoundException(sb.toString());
            }
            IngredientOutputDto ingredientOutputDto = ingredientService.createIngredient(ingredientInputDto);
            return ResponseEntity.created(null).body(ingredientOutputDto);
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }



    }
}
