package low_level_design.ParkingLot.repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    void save(T t);
    Optional<T> findById(String id);
    List<T> findAll();
}
