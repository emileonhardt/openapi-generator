/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model

import org.openapitools.server.api.model.Category
import org.openapitools.server.api.model.Tag

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * A pet for sale in the pet store
 * @param id 
 * @param category 
 * @param name 
 * @param photoUrls 
 * @param tags 
 * @param status pet status in the store
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Pet (
    @SerializedName("name") private var _name: kotlin.String?,
    @SerializedName("photoUrls") private var _photoUrls: kotlin.Array<kotlin.String>?,
    var id: kotlin.Long? = null,
    var category: Category? = null,
    var tags: kotlin.Array<Tag>? = null,
    /* pet status in the store */
    var status: Pet.Status? = null
) {

    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String){
    
        available("available"),
    
        pending("pending"),
    
        sold("sold");
    
    }

        var name get() = _name ?: throw IllegalArgumentException("name is required")
                    set(value){ _name = value }
        var photoUrls get() = _photoUrls ?: throw IllegalArgumentException("photoUrls is required")
                    set(value){ _photoUrls = value }
}

