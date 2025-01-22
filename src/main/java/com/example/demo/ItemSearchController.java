package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/item/search")
public class ItemSearchController {

    private final ItemSearchService itemSearchService;

    @GetMapping
    public ResponseEntity<List<ItemDocument>> search(@RequestParam("keyword") String keyword) {
        return ResponseEntity.ok(itemSearchService.getItemByName(keyword));
    }

    @PostMapping
    public ResponseEntity<ItemDocument> create(@RequestBody ItemDocument itemDocument) {
        System.out.println("ininin");
        return ResponseEntity.ok(itemSearchService.createItem(itemDocument));
    }

}
