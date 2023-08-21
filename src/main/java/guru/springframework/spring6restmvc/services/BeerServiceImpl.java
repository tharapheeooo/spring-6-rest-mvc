package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, Beer> beerMap;
    public BeerServiceImpl() {

        this.beerMap = new HashMap<>();

        Beer beer1 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123445")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .updateDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        Beer beer2 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Crank")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123445")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .updateDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        Beer beer3 = Beer.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Sunshine City")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123445")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .updateDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public List<Beer> listBeers() {
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Optional<Beer> getBeerById(UUID id) {



        log.debug("Get Beer Id in Service was called");

        return Optional.of(beerMap.get(id));
    }

    @Override
    public Beer saveNewBeer(Beer beer) {
        Beer saveBeer = Beer.builder()
                .id(UUID.randomUUID())
                .version(beer.getVersion())
                .beerName(beer.getBeerName())
                .beerStyle(beer.getBeerStyle())
                .upc(beer.getUpc())
                .price(beer.getPrice())
                .quantityOnHand(beer.getQuantityOnHand())
                .updateDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();
        beerMap.put(saveBeer.getId(), saveBeer);
        return saveBeer;
    }

    @Override
    public void updateById(UUID beerId, Beer beer) {
        Beer exsitsing = beerMap.get(beerId);
        exsitsing.setBeerName(beer.getBeerName());
        exsitsing.setPrice(beer.getPrice());
        exsitsing.setUpc(beer.getUpc());
        exsitsing.setQuantityOnHand(beer.getQuantityOnHand());
        //beerMap.put(exsitsing.getId(),exsitsing);
    }

    @Override
    public void deleteById(UUID beerId) {
        beerMap.remove(beerId);
    }

    @Override
    public void updateBeerPatchById(UUID beerId, Beer beer) {
        Beer exiting = beerMap.get(beerId);
        //0038600900022117
        if(StringUtils.hasText(beer.getBeerName())){
            exiting.setBeerName(beer.getBeerName());
        }
        if (beer.getBeerStyle() != null){
            exiting.setBeerStyle(beer.getBeerStyle());
        }
        if (beer.getPrice() != null){
            exiting.setPrice(beer.getPrice());
        }
        if (beer.getQuantityOnHand() != null){
            exiting.setQuantityOnHand(beer.getQuantityOnHand());
        }
        if (StringUtils.hasText(beer.getUpc())){
            exiting.setUpc(beer.getUpc());
        }
    }
}
