package org.auto.org.auto.app.repositorys;

import org.auto.org.auto.app.entitys.SpAutoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ISpAutoTypeRepository extends JpaRepository<SpAutoType, UUID> {
    public SpAutoType findByName(String name);

    @Query(value = "DELETE FROM public.sp_auto_type WHERE name = :name", nativeQuery = true)
    void deleteAllByName(@Param("name") String name);

    List<SpAutoType> findAllByName(String name);
}
