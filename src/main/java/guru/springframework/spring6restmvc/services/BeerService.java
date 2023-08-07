package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();
    Beer getBeerById(UUID id);

    Beer saveNewBeer(Beer beer);

    void updateById(UUID beerId, Beer beer);
}
