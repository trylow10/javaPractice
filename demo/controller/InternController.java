package com.example.controller;

import com.example.dao.InternDao;
import com.example.model.DeleteRequest;
import com.example.model.Intern;
import com.example.model.PostRequest;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.UUID;

@Controller("/intern")
public class InternController {

    private final InternDao dao;

    private static final Logger log = LoggerFactory.getLogger(InternController.class);

    @Inject
    InternController(InternDao dao) {
        this.dao = dao;
    }

    @Get("/all")
    List<Intern> getAll() {
        log.info("getAll :: started");
        var interns = dao.fetchAll();
        log.info("getAll :: return: {}", interns);
        return interns;
    }

    @Get
    Intern get(@Parameter("id") String id) {
        log.info("get :: id: {}", id);
        var uuid = UUID.fromString(id);
        var intern = dao.read(uuid);
        log.info("get :: return: {}", intern);
        return intern;
    }

    @Put
    Intern put(@Body Intern body) {
        log.info("put :: body: {}", body);
        dao.update(body);
        log.info("put :: return: {}", body);
        return body;
    }

    @Post
    Intern post(@Body PostRequest body) {
        log.info("post :: body: {}", body);
        var id = UUID.randomUUID();
        var name = body.name();
        var age = body.age();
        var intern = new Intern(id, name, age);
        dao.create(intern);
        log.info("post :: return: {}", intern);
        return intern;
    }

    @Delete
    void delete(@Body DeleteRequest body) {
        var id = body.id();
        log.info("delete :: id: {}", id);
        dao.delete(id);
        log.info("delete :: done");
    }
}
