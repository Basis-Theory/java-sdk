# Reference
## Applications
<details><summary><code>client.applications.list() -> ApplicationPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().list(
    ApplicationsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applications.create(request) -> Application</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().create(
    CreateApplicationRequest
        .builder()
        .name("name")
        .type("type")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**type:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**permissions:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**rules:** `Optional<List<AccessRule>>` 
    
</dd>
</dl>

<dl>
<dd>

**createKey:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applications.get(id) -> Application</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applications.update(id, request) -> Application</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().update(
    "id",
    UpdateApplicationRequest
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**permissions:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**rules:** `Optional<List<AccessRule>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applications.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applications.getByKey() -> Application</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applications().getByKey();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplicationKeys
<details><summary><code>client.applicationKeys.list(id) -> List&amp;lt;ApplicationKey&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationKeys().list(
    "id",
    ApplicationKeysListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**id:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applicationKeys.create(id) -> ApplicationKey</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationKeys().create("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applicationKeys.get(id, keyId) -> ApplicationKey</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationKeys().get("id", "keyId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**keyId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applicationKeys.delete(id, keyId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationKeys().delete("id", "keyId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**keyId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplicationTemplates
<details><summary><code>client.applicationTemplates.list() -> List&amp;lt;ApplicationTemplate&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationTemplates().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applicationTemplates.get(id) -> ApplicationTemplate</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applicationTemplates().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplePay
<details><summary><code>client.applePay.create(request) -> ApplePayCreateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().create(
    ApplePayCreateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**expiresAt:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**applePaymentData:** `Optional<ApplePayMethodToken>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantRegistrationId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.get(id) -> ApplePayToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.delete(id) -> String</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## GooglePay
<details><summary><code>client.googlePay.create(request) -> GooglePayCreateResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().create(
    GooglePayCreateRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**expiresAt:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**googlePaymentData:** `Optional<GooglePayMethodToken>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantRegistrationId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.get(id) -> GooglePayToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.delete(id) -> String</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Documents
<details><summary><code>client.documents.upload(request) -> Document</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.documents().upload(
    DocumentsUploadRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.documents.get(id) -> Document</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.documents().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.documents.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.documents().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tokens
<details><summary><code>client.tokens.detokenize(request) -> Object</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().detokenize(new 
HashMap<String, Object>() {{put("key", "value");
}});
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `Object` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.tokenize(request) -> Object</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().tokenize(new 
HashMap<String, Object>() {{put("key", "value");
}});
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `Object` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.get(id) -> Token</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.update(id, request) -> Token</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().update(
    "id",
    UpdateTokenRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**data:** `Optional<Object>` 
    
</dd>
</dl>

<dl>
<dd>

**privacy:** `Optional<UpdatePrivacy>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**searchIndexes:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**fingerprintExpression:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**mask:** `Optional<Object>` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**deduplicateToken:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**containers:** `Optional<List<String>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.create(request) -> Token</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().create(
    CreateTokenRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**request:** `CreateTokenRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.listV2() -> TokenCursorPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().listV2(
    TokensListV2Request
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**container:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**fingerprint:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokens.searchV2(request) -> TokenCursorPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokens().searchV2(
    SearchTokensRequestV2
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**query:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Enrichments
<details><summary><code>client.enrichments.bankAccountVerify(request) -> BankVerificationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.enrichments().bankAccountVerify(
    BankVerificationRequest
        .builder()
        .tokenId("token_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tokenId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**countryCode:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**routingNumber:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.enrichments.getcarddetails() -> CardDetailsResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.enrichments().getcarddetails(
    EnrichmentsGetCardDetailsRequest
        .builder()
        .bin("bin")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**bin:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Keys
<details><summary><code>client.keys.list() -> List&amp;lt;ClientEncryptionKeyMetadataResponse&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.keys().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.keys.create(request) -> ClientEncryptionKeyResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.keys().create(
    ClientEncryptionKeyRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.keys.get(id) -> ClientEncryptionKeyMetadataResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.keys().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.keys.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.keys().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Logs
<details><summary><code>client.logs.list() -> LogPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.logs().list(
    LogsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**entityType:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**entityId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**startDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**endDate:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.logs.getEntityTypes() -> List&amp;lt;LogEntityType&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.logs().getEntityTypes();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## NetworkTokens
<details><summary><code>client.networkTokens.create(request) -> NetworkToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().create(
    CreateNetworkTokenRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**data:** `Optional<Card>` 
    
</dd>
</dl>

<dl>
<dd>

**tokenId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**tokenIntentId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**cardholderInfo:** `Optional<CardholderInfo>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.networkTokens.cryptogram(id) -> NetworkTokenCryptogram</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().cryptogram("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.networkTokens.get(id) -> NetworkToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.networkTokens.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.networkTokens.suspend(id) -> NetworkToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().suspend("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.networkTokens.resume(id) -> NetworkToken</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.networkTokens().resume("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Permissions
<details><summary><code>client.permissions.list() -> List&amp;lt;Permission&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.permissions().list(
    PermissionsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**applicationType:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Proxies
<details><summary><code>client.proxies.list() -> ProxyPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().list(
    ProxiesListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.proxies.create(request) -> Proxy</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().create(
    CreateProxyRequest
        .builder()
        .name("name")
        .destinationUrl("destination_url")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**destinationUrl:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**requestReactorId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**responseReactorId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**requireAuth:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**disableDetokenization:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.proxies.get(id) -> Proxy</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.proxies.update(id, request) -> Proxy</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().update(
    "id",
    UpdateProxyRequest
        .builder()
        .name("name")
        .destinationUrl("destination_url")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**destinationUrl:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**requestReactorId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**responseReactorId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**requireAuth:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**disableDetokenization:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.proxies.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.proxies.patch(id, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.proxies().patch(
    "id",
    PatchProxyRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**destinationUrl:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransform:** `Optional<ProxyTransform>` 
    
</dd>
</dl>

<dl>
<dd>

**requestTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**responseTransforms:** `Optional<List<ProxyTransform>>` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**requireAuth:** `Optional<Boolean>` 
    
</dd>
</dl>

<dl>
<dd>

**disableDetokenization:** `Optional<Boolean>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Reactors
<details><summary><code>client.reactors.list() -> ReactorPaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().list(
    ReactorsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.create(request) -> Reactor</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().create(
    CreateReactorRequest
        .builder()
        .name("name")
        .code("code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**code:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**runtime:** `Optional<Runtime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.get(id) -> Reactor</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.update(id, request) -> Reactor</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().update(
    "id",
    UpdateReactorRequest
        .builder()
        .name("name")
        .code("code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**code:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**runtime:** `Optional<Runtime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.patch(id, request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().patch(
    "id",
    PatchReactorRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**application:** `Optional<Application>` 
    
</dd>
</dl>

<dl>
<dd>

**code:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**configuration:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>

<dl>
<dd>

**runtime:** `Optional<Runtime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.react(id, request) -> ReactResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().react("id", new 
HashMap<String, Object>() {{put("key", "value");
}});
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `Object` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.reactors.reactAsync(id, request) -> AsyncReactResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().reactAsync("id", new 
HashMap<String, Object>() {{put("key", "value");
}});
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `Object` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Roles
<details><summary><code>client.roles.list() -> List&amp;lt;Role&amp;gt;</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.roles().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Sessions
<details><summary><code>client.sessions.create() -> CreateSessionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().create();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.sessions.authorize(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.sessions().authorize(
    AuthorizeSessionRequest
        .builder()
        .nonce("nonce")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**nonce:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**permissions:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**rules:** `Optional<List<AccessRule>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## TokenIntents
<details><summary><code>client.tokenIntents.get(id) -> TokenIntent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokenIntents().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokenIntents.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokenIntents().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tokenIntents.create(request) -> CreateTokenIntentResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tokenIntents().create(
    CreateTokenIntentRequest
        .builder()
        .type("x")
        .data(new 
            HashMap<String, Object>() {{put("key", "value");
            }})
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**type:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**data:** `Object` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Webhooks
<details><summary><code>client.webhooks.ping()</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Simple endpoint that can be utilized to verify the application is running
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().ping();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.get(id) -> Webhook</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the webhook
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.update(id, request) -> Webhook</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Update a new webhook
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().update(
    "id",
    UpdateWebhookRequest
        .builder()
        .name("webhook-update")
        .url("http://www.example.com")
        .events(
            new ArrayList<String>(
                Arrays.asList("token:created")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `String` — The name of the webhook
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — The URL to which the webhook will send events
    
</dd>
</dl>

<dl>
<dd>

**notifyEmail:** `Optional<String>` — The email address to use for management notification events. Ie: webhook disabled
    
</dd>
</dl>

<dl>
<dd>

**events:** `List<String>` — An array of event types that the webhook will listen for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.delete(id)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Delete a new webhook
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.list() -> WebhookList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the configured webhooks
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.webhooks.create(request) -> Webhook</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a new webhook
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().create(
    CreateWebhookRequest
        .builder()
        .name("webhook-create")
        .url("http://www.example.com")
        .events(
            new ArrayList<String>(
                Arrays.asList("token:created")
            )
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` — The name of the webhook
    
</dd>
</dl>

<dl>
<dd>

**url:** `String` — The URL to which the webhook will send events
    
</dd>
</dl>

<dl>
<dd>

**notifyEmail:** `Optional<String>` — The email address to use for management notification events. Ie: webhook disabled
    
</dd>
</dl>

<dl>
<dd>

**events:** `List<String>` — An array of event types that the webhook will listen for
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AccountUpdater Jobs
<details><summary><code>client.accountUpdater.jobs.get(id) -> AccountUpdaterJob</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the account updater batch job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.accountUpdater().jobs().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.accountUpdater.jobs.list() -> AccountUpdaterJobList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns a list of account updater batch jobs
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.accountUpdater().jobs().list(
    JobsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**size:** `Optional<Integer>` — The maximum number of jobs to return
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` — Cursor for pagination
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.accountUpdater.jobs.create() -> AccountUpdaterJob</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the created account updater batch job
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.accountUpdater().jobs().create();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## AccountUpdater RealTime
<details><summary><code>client.accountUpdater.realTime.invoke(request) -> AccountUpdaterRealTimeResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Returns the update result
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.accountUpdater().realTime().invoke(
    AccountUpdaterRealTimeRequest
        .builder()
        .tokenId("9a420b15-ddfe-4793-9466-48f53520e47c")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tokenId:** `String` — Card Token identifier
    
</dd>
</dl>

<dl>
<dd>

**expirationYear:** `Optional<Integer>` — The 4-digit expiration year of the account number. Not required if the card token already stores this value.
    
</dd>
</dl>

<dl>
<dd>

**expirationMonth:** `Optional<Integer>` — The 2-digit expiration month of the account number. Not required if the card token already stores this value.
    
</dd>
</dl>

<dl>
<dd>

**deduplicateToken:** `Optional<Boolean>` — Whether deduplication should be enabled when creating the new token. Uses the value of the Deduplicate Tokens setting on the tenant if not set.
    
</dd>
</dl>

<dl>
<dd>

**merchantId:** `Optional<String>` — Tenant merchant identifier
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Agents
<details><summary><code>client.agentic.agents.create(request) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().create(
    CreateAgentRequest
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**enrollmentIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**instanceDetails:** `Optional<InstanceDetails>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.get(agentId) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().get("agent_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.delete(agentId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().delete("agent_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.update(agentId, request) -> Agent</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().update(
    "agent_id",
    UpdateAgentRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**name:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**enrollmentIds:** `Optional<List<String>>` 
    
</dd>
</dl>

<dl>
<dd>

**instanceDetails:** `Optional<InstanceDetails>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Enrollments
<details><summary><code>client.agentic.enrollments.list() -> EnrollmentList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List all enrollments for the current tenant with cursor-based pagination.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().list(
    EnrollmentsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Pagination cursor from a previous response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.create(request) -> Enrollment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Enroll a card token with a card network (Visa or Mastercard).
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().create(
    CreateEnrollmentRequest
        .builder()
        .tokenId("token_id")
        .consumer(
            Consumer
                .builder()
                .email("email")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**tokenId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**consumer:** `Consumer` 
    
</dd>
</dl>

<dl>
<dd>

**agentId:** `Optional<String>` — Single agent ID (mutually exclusive with agent_ids)
    
</dd>
</dl>

<dl>
<dd>

**agentIds:** `Optional<List<String>>` — Multiple agent IDs (mutually exclusive with agent_id)
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.get(enrollmentId) -> Enrollment</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().get("enrollment_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.delete(enrollmentId)</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Soft-deletes the enrollment by marking its status as deleted.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().delete("enrollment_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.retry(enrollmentId) -> Enrollment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retry enrolling a card that previously failed. Only failed enrollments can be retried.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().retry("enrollment_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Agents Instructions
<details><summary><code>client.agentic.agents.instructions.list(agentId) -> InstructionList</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

List all purchase instructions for an agent with cursor-based pagination and optional enrollment filter.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().list(
    "agent_id",
    InstructionsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**enrollmentId:** `Optional<String>` — Filter instructions by enrollment ID
    
</dd>
</dl>

<dl>
<dd>

**limit:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**cursor:** `Optional<String>` — Pagination cursor from a previous response
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.instructions.create(agentId, request) -> Instruction</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Create a new payment instruction for an agent, linked to an enrollment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().create(
    "agent_id",
    CreateInstructionRequest
        .builder()
        .enrollmentId("enrollment_id")
        .amount(
            Amount
                .builder()
                .value("100.00")
                .build()
        )
        .description("description")
        .expiresAt(OffsetDateTime.parse("2024-01-15T09:30:00Z"))
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Amount` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `OffsetDateTime` 
    
</dd>
</dl>

<dl>
<dd>

**assuranceData:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**recurring:** `Optional<Recurring>` 
    
</dd>
</dl>

<dl>
<dd>

**instanceDetails:** `Optional<InstanceDetails>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.instructions.get(agentId, instructionId) -> Instruction</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().get("agent_id", "instruction_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.instructions.delete(agentId, instructionId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().delete("agent_id", "instruction_id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.instructions.update(agentId, instructionId, request) -> Instruction</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().update(
    "agent_id",
    "instruction_id",
    UpdateInstructionRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Amount>` 
    
</dd>
</dl>

<dl>
<dd>

**description:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**expiresAt:** `Optional<OffsetDateTime>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Agents Instructions Credentials
<details><summary><code>client.agentic.agents.instructions.credentials.create(agentId, instructionId, request) -> Credentials</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Retrieve payment credentials (card number, expiration, CVC) for a purchase instruction.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().credentials().create(
    "agent_id",
    "instruction_id",
    GetCredentialsRequest
        .builder()
        .merchant(
            Merchant
                .builder()
                .name("name")
                .url("url")
                .countryCode("country_code")
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**products:** `Optional<List<Product>>` 
    
</dd>
</dl>

<dl>
<dd>

**merchant:** `Merchant` 
    
</dd>
</dl>

<dl>
<dd>

**amount:** `Optional<Amount>` 
    
</dd>
</dl>

<dl>
<dd>

**deliveryMethod:** `Optional<DeliveryMethod>` 
    
</dd>
</dl>

<dl>
<dd>

**shippingAddress:** `Optional<ShippingAddress>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Agents Instructions Verify
<details><summary><code>client.agentic.agents.instructions.verify.start(agentId, instructionId, request) -> VerificationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Initiate cardholder verification for a purchase instruction that requires it.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().verify().start(
    "agent_id",
    "instruction_id",
    StartVerificationRequest
        .builder()
        .deviceContext(
            DeviceContext
                .builder()
                .screenHeight(1)
                .screenWidth(1)
                .userAgentString("user_agent_string")
                .languageCode("language_code")
                .timeZone("time_zone")
                .javaScriptEnabled(true)
                .clientDeviceId("client_device_id")
                .clientReferenceId("client_reference_id")
                .platformType(DeviceContextPlatformType.WEB)
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `StartVerificationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.agents.instructions.verify.passkey(agentId, instructionId, request) -> Instruction</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Submit passkey/FIDO assertion data to complete instruction verification.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().agents().instructions().verify().passkey(
    "agent_id",
    "instruction_id",
    SubmitPasskeyRequest
        .builder()
        .assuranceData(
            new HashMap<String, Object>() {{
                put("key", "value");
            }}
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**agentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**instructionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**assuranceData:** `Map<String, Object>` — Visa format (identifier, dfp_session_id, fido_assertion_data) or Mastercard format (flexible object)
    
</dd>
</dl>

<dl>
<dd>

**srcCorrelationId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**flowId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Agentic Enrollments Verify
<details><summary><code>client.agentic.enrollments.verify.start(enrollmentId, request) -> VerificationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Initiates the cardholder verification flow for a pending enrollment.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().verify().start(
    "enrollment_id",
    StartVerificationRequest
        .builder()
        .deviceContext(
            DeviceContext
                .builder()
                .screenHeight(1)
                .screenWidth(1)
                .userAgentString("user_agent_string")
                .languageCode("language_code")
                .timeZone("time_zone")
                .javaScriptEnabled(true)
                .clientDeviceId("client_device_id")
                .clientReferenceId("client_reference_id")
                .platformType(DeviceContextPlatformType.WEB)
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `StartVerificationRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.verify.method(enrollmentId, request) -> VerificationResponse</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Choose the OTP delivery method (SMS, email, etc.) for enrollment verification.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().verify().method(
    "enrollment_id",
    SelectMethodRequest
        .builder()
        .methodId("method_id")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**methodId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.verify.otp(enrollmentId, request) -> Enrollment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Submit the one-time password received by the cardholder.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().verify().otp(
    "enrollment_id",
    SubmitOtpRequest
        .builder()
        .otpCode("otp_code")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**otpCode:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.agentic.enrollments.verify.complete(enrollmentId, request) -> Enrollment</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Complete the verification flow (e.g. after passkey creation). Body is optional — Visa sends empty body, Mastercard sends assurance_data.
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.agentic().enrollments().verify().complete(
    "enrollment_id",
    CompleteVerificationRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**enrollmentId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**assuranceData:** `Optional<Map<String, Object>>` 
    
</dd>
</dl>

<dl>
<dd>

**srcCorrelationId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplePay Merchant
<details><summary><code>client.applePay.merchant.get(id) -> ApplePayMerchant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.merchant.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.merchant.create(request) -> ApplePayMerchant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().create(
    ApplePayMerchantRegisterRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantIdentifier:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplePay Domain
<details><summary><code>client.applePay.domain.deregister(request)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().domain().deregister(
    ApplePayDomainDeregistrationRequest
        .builder()
        .domain("domain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domain:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.domain.get() -> ApplePayDomainRegistrationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().domain().get();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.domain.register(request) -> ApplePayDomainRegistrationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().domain().register(
    ApplePayDomainRegistrationRequest
        .builder()
        .domain("domain")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domain:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.domain.registerAll(request) -> ApplePayDomainRegistrationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().domain().registerAll(
    ApplePayDomainRegistrationListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**domains:** `Optional<List<String>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplePay Session
<details><summary><code>client.applePay.session.create(request) -> String</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().session().create(
    ApplePaySessionRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**validationUrl:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**displayName:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**domain:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantRegistrationId:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## ApplePay Merchant Certificates
<details><summary><code>client.applePay.merchant.certificates.get(merchantId, id) -> ApplePayMerchantCertificates</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().certificates().get("merchantId", "id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.merchant.certificates.delete(merchantId, id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().certificates().delete("merchantId", "id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.applePay.merchant.certificates.create(merchantId, request) -> ApplePayMerchantCertificates</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.applePay().merchant().certificates().create(
    "merchantId",
    ApplePayMerchantCertificatesRegisterRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**merchantCertificateData:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantCertificatePassword:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**paymentProcessorCertificateData:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**paymentProcessorCertificatePassword:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**domain:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Documents Data
<details><summary><code>client.documents.data.get(documentId) -> InputStream</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.documents().data().get("documentId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**documentId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## GooglePay Merchant
<details><summary><code>client.googlePay.merchant.get(id) -> GooglePayMerchant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.merchant.delete(id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().delete("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.merchant.create(request) -> GooglePayMerchant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().create(
    GooglePayMerchantRegisterRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantIdentifier:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## GooglePay Merchant Certificates
<details><summary><code>client.googlePay.merchant.certificates.get(merchantId, id) -> GooglePayMerchantCertificates</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().certificates().get("merchantId", "id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.merchant.certificates.delete(merchantId, id)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().certificates().delete("merchantId", "id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.googlePay.merchant.certificates.create(merchantId, request) -> GooglePayMerchantCertificates</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.googlePay().merchant().certificates().create(
    "merchantId",
    GooglePayMerchantCertificatesRegisterRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**merchantId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**merchantCertificateData:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**merchantCertificatePassword:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Reactors Results
<details><summary><code>client.reactors.results.get(id, requestId) -> Object</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.reactors().results().get("id", "requestId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**requestId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants SecurityContact
<details><summary><code>client.tenants.securityContact.get() -> SecurityContactEmailResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().securityContact().get();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.securityContact.update(request) -> SecurityContactEmailResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().securityContact().update(
    SecurityContactEmailRequest
        .builder()
        .email("email")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants Connections
<details><summary><code>client.tenants.connections.create(request) -> CreateTenantConnectionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().connections().create(
    CreateTenantConnectionRequest
        .builder()
        .strategy("strategy")
        .options(
            TenantConnectionOptions
                .builder()
                .build()
        )
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**strategy:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**options:** `TenantConnectionOptions` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.connections.delete() -> CreateTenantConnectionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().connections().delete();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants Invitations
<details><summary><code>client.tenants.invitations.list() -> TenantInvitationResponsePaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().invitations().list(
    InvitationsListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**status:** `Optional<TenantInvitationStatus>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.invitations.create(request) -> TenantInvitationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().invitations().create(
    CreateTenantInvitationRequest
        .builder()
        .email("email")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**email:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**role:** `Optional<String>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.invitations.resend(invitationId) -> TenantInvitationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().invitations().resend("invitationId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invitationId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.invitations.get(invitationId) -> TenantInvitationResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().invitations().get("invitationId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invitationId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.invitations.delete(invitationId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().invitations().delete("invitationId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**invitationId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants Members
<details><summary><code>client.tenants.members.list() -> TenantMemberResponsePaginatedList</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().members().list(
    MembersListRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**userId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**page:** `Optional<Integer>` 
    
</dd>
</dl>

<dl>
<dd>

**start:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**size:** `Optional<Integer>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.members.update(memberId, request) -> TenantMemberResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().members().update(
    "memberId",
    UpdateTenantMemberRequest
        .builder()
        .role("role")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**memberId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**role:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.members.delete(memberId)</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().members().delete("memberId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**memberId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants Owner
<details><summary><code>client.tenants.owner.get() -> TenantMemberResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().owner().get();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Tenants Self
<details><summary><code>client.tenants.self.getUsageReports() -> TenantUsageReport</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().self().getUsageReports();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.self.get() -> Tenant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().self().get();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.self.update(request) -> Tenant</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().self().update(
    UpdateTenantRequest
        .builder()
        .name("name")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**name:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**settings:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.tenants.self.delete()</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.tenants().self().delete();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Threeds Sessions
<details><summary><code>client.threeds.sessions.create(request) -> CreateThreeDsSessionResponse</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.threeds().sessions().create(
    CreateThreeDsSessionRequest
        .builder()
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**pan:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**tokenId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**tokenIntentId:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**type:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**device:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**webChallengeMode:** `Optional<String>` 
    
</dd>
</dl>

<dl>
<dd>

**deviceInfo:** `Optional<ThreeDsDeviceInfo>` 
    
</dd>
</dl>

<dl>
<dd>

**authenticationRequest:** `Optional<AuthenticateThreeDsSessionRequest>` 
    
</dd>
</dl>

<dl>
<dd>

**callbackUrls:** `Optional<ThreeDsCallbackUrls>` 
    
</dd>
</dl>

<dl>
<dd>

**metadata:** `Optional<Map<String, Optional<String>>>` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.threeds.sessions.authenticate(sessionId, request) -> ThreeDsAuthentication</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.threeds().sessions().authenticate(
    "sessionId",
    AuthenticateThreeDsSessionRequest
        .builder()
        .authenticationCategory("authentication_category")
        .authenticationType("authentication_type")
        .build()
);
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionId:** `String` 
    
</dd>
</dl>

<dl>
<dd>

**request:** `AuthenticateThreeDsSessionRequest` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.threeds.sessions.getChallengeResult(sessionId) -> ThreeDsAuthentication</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.threeds().sessions().getChallengeResult("sessionId");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**sessionId:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

<details><summary><code>client.threeds.sessions.get(id) -> ThreeDsSession</code></summary>
<dl>
<dd>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.threeds().sessions().get("id");
```
</dd>
</dl>
</dd>
</dl>

#### ⚙️ Parameters

<dl>
<dd>

<dl>
<dd>

**id:** `String` 
    
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>

## Webhooks Events
<details><summary><code>client.webhooks.events.list() -> List&amp;lt;String&amp;gt;</code></summary>
<dl>
<dd>

#### 📝 Description

<dl>
<dd>

<dl>
<dd>

Return a list of available event types
</dd>
</dl>
</dd>
</dl>

#### 🔌 Usage

<dl>
<dd>

<dl>
<dd>

```java
client.webhooks().events().list();
```
</dd>
</dl>
</dd>
</dl>


</dd>
</dl>
</details>
