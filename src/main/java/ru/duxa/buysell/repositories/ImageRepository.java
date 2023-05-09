package ru.duxa.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.duxa.buysell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
