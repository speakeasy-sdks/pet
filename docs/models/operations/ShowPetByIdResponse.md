# ShowPetByIdResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `error`                                                                                                                  | [com.testworkspace2.pet.api_name_pet.models.shared.Error](../../models/shared/Error.md)                                  | :heavy_minus_sign:                                                                                                       | unexpected error                                                                                                         |
| `pet`                                                                                                                    | [com.testworkspace2.pet.api_name_pet.models.shared.Pet](../../models/shared/Pet.md)                                      | :heavy_minus_sign:                                                                                                       | Expected response to a valid request                                                                                     |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |