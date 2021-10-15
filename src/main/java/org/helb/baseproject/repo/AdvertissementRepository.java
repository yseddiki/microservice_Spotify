package org.helb.baseproject.repo;

import org.helb.baseproject.model.entity.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertissementRepository extends JpaRepository<Advertisement, Long> {
}
