package ru.iedev.taskmanager.model.UserTaskManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.iedev.taskmanager.model.UserTaskManager.UserTaskManager;

@Repository
public interface UserTaskManagerRepository extends JpaRepository<UserTaskManager, Integer> {
    @Transactional
    @Modifying
    @Query("update UserTaskManager p set p.name = :name where p.id = :id")
    void setCovidInfo(@Param("name") String name, @Param("id") int id);

    UserTaskManager findByName(String name);
}
