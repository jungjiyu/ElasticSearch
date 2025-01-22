package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemSearchService {

    private final ItemSearchRepository itemSearchRepository;

    public ItemDocument createItem(ItemDocument itemDocument) {
        return itemSearchRepository.save(itemDocument);
    }

    public List<ItemDocument> getItemByName(String keyword) {
        return itemSearchRepository.findByName(keyword);
    }
}
