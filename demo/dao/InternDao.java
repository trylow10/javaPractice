package com.example.dao;

import com.example.exception.AlreadyExistsException;
import com.example.exception.NotFoundException;
import com.example.model.Intern;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Singleton
public class InternDao {

    private static final Logger log = LoggerFactory.getLogger(InternDao.class);
    private final Map<UUID, Intern> database = new HashMap<>();

    public void create(Intern intern) {
        log.info("create :: intern: {}", intern);
        if (database.containsKey(intern.id())) {
            throw new AlreadyExistsException("id already exists");
        } else {
            database.put(intern.id(), intern);
            log.info("create :: done");
        }
    }

    public Intern read(UUID id) {
        log.info("read :: id: {}", id);
        var intern = database.get(id);
        if (intern == null) {
            throw new NotFoundException("intern not found");
        } else {
            log.info("read :: return: {}", intern);
            return intern;
        }
    }

    public void update(Intern intern) {
        log.info("update :: intern: {}", intern);
        if (database.containsKey(intern.id())) {
            database.put(intern.id(), intern);
            log.info("update :: done");
        } else {
            throw new NotFoundException("id doesn't exist");
        }
    }

    public void delete(UUID id) {
        log.info("delete :: id: {}", id);
        database.remove(id);
        log.info("delete :: done");
    }

    public List<Intern> fetchAll() {
        return database.values()
                .stream()
                .toList();
    }
}
