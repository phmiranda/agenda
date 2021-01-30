/**
 * User: phmiranda
 * Project: agenda
 * Description: controller
 * Date: 16/12/2020
 */

package br.com.phmiranda.controller;

import br.com.phmiranda.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PATCH;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/users")
public class UserController {
    @GET
    public void index() {

    }

    @GET
    public void show() {

    }

    @POST
    public void store() {
        UserService userService = new UserService();
        userService.atualizaStatusUsuario();
    }

    @PUT
    public void update() {
        UserService userService = new UserService();
        userService.atualizaStatusUsuario();
    }

    @DELETE
    public void delete() {

    }

    @GET
    public void findByName() {

    }

    @GET
    public void findByEmail() {

    }
}
