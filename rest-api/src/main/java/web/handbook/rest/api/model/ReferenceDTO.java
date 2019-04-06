package web.handbook.rest.api.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@ApiModel(
        description = "Representation of a handbook reference resource"
)
public class ReferenceDTO {
    @JsonProperty("id")
    private Long id;
    @NotNull
    @Size(min = 5, max = 16, message = "{username.size}")
    @JsonProperty("user_name")
    private String username;
    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    @JsonProperty("password")
    private String password;
    @NotNull
    @Size(min = 2, max = 30, message = "{firstName.size}")
    @JsonProperty("first_name")
    private String firstName;
    @NotNull
    @Size(min = 2, max = 30, message = "{lastName.size}")
    @JsonProperty("last_name")
    private String lastName;
    @NotNull
    @Email(message = "{email.valid}")
    @JsonProperty("email")
    private String email;

    @JsonProperty("creation_time")
    private LocalDate ts;

    public ReferenceDTO() {

    }

    public ReferenceDTO(String username, LocalDate ts) {
        this.username = username;
        this.ts = ts;
    }

    public ReferenceDTO(Long id, String username, String password, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ReferenceDTO(String username, String password, String firstName, String lastName) {
        this(null, username, password, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getTs() {
        return ts;
    }

    public void setTs(LocalDate ts) {
        this.ts = ts;
    }


}