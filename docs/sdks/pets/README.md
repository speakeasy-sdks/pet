# Pets
(*pets*)

### Available Operations

* [createPets](#createpets) - Create a pet
* [listPets](#listpets) - List all pets
* [showPetById](#showpetbyid) - Info for a specific pet

## createPets

Create a pet

### Example Usage

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
                "<value>"){{
                tag = "<value>";

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

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [com.testworkspace2.pet.api_name_pet.models.shared.Pet](../../models/shared/Pet.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[com.testworkspace2.pet.api_name_pet.models.operations.CreatePetsResponse](../../models/operations/CreatePetsResponse.md)**


## listPets

List all pets

### Example Usage

```java
package hello.world;

import com.testworkspace2.pet.api_name_pet.ApiNamePet;
import com.testworkspace2.pet.api_name_pet.models.operations.ListPetsRequest;
import com.testworkspace2.pet.api_name_pet.models.operations.ListPetsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            ApiNamePet sdk = ApiNamePet.builder()            .build();

            com.testworkspace2.pet.api_name_pet.models.operations.ListPetsRequest req = new ListPetsRequest(
){{
                limit = 21453;

            }};

            com.testworkspace2.pet.api_name_pet.models.operations.ListPetsResponse res = sdk.pets.listPets(req);

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [com.testworkspace2.pet.api_name_pet.models.operations.ListPetsRequest](../../models/operations/ListPetsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[com.testworkspace2.pet.api_name_pet.models.operations.ListPetsResponse](../../models/operations/ListPetsResponse.md)**


## showPetById

Info for a specific pet

### Example Usage

```java
package hello.world;

import com.testworkspace2.pet.api_name_pet.ApiNamePet;
import com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdRequest;
import com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdResponse;

public class Application {
    public static void main(String[] args) {
        try {
            ApiNamePet sdk = ApiNamePet.builder()            .build();

            com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdRequest req = new ShowPetByIdRequest(
                "<value>");

            com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdResponse res = sdk.pets.showPetById(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdRequest](../../models/operations/ShowPetByIdRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |


### Response

**[com.testworkspace2.pet.api_name_pet.models.operations.ShowPetByIdResponse](../../models/operations/ShowPetByIdResponse.md)**

