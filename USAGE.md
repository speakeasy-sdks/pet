<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.testworkspace2.pet.api_name_pet.ApiNamePet;
import com.testworkspace2.pet.api_name_pet.models.operations.CreatePetsResponse;
import com.testworkspace2.pet.api_name_pet.models.shared.Pet;

public class Application {
    public static void main(String[] args) {
        try {
            ApiNamePet sdk = ApiNamePet.builder()            .build();

            com.testworkspace2.pet.api_name_pet.models.shared.Pet req = new Pet(
                596804L,
                "string"){{
                tag = "string";

            }};

            com.testworkspace2.pet.api_name_pet.models.operations.CreatePetsResponse res = sdk.pets.createPets(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->