# Unit Test In Spring Boot

>Unit Testing in Spring Boot

> How to write end to end test using Spring Boot.


**Key Annotation**

- @SpringBootTest
- @LocalServerPort
- @Test

---
																		
## Table of Contents 

> 

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [Team](#team)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


---

## Example (Test Class)

```javascript
package tbp.unit.testing.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import tbp.unit.testing.mokito.dao.UserDao;
import tbp.unit.testing.mokito.service.UserService;

/**
 * @author rajan
 *
 */

@RunWith(SpringRunner.class) 
public class UnitTestingWithMockito {

	@InjectMocks
	UserService service;
	@Mock
	UserDao dao;

	@Test
	public void getUserIdTest() {
		when(dao.getUserId("Rajanikanta")).thenReturn("123445Rajanikanta");
		String id = service.getUseruserIdByName("Rajanikanta");
		assertEquals("123445Rajanikanta", id);

	}

}


```

---

## Installation

- Clone this repository
- Import in to IDE
- Do a maven clean and build

### Clone

- Clone this repo to your local machine.

### Setup

- 

> Do maven update


> Run the junit

---

## Features
## Usage 
## Documentation
## Tests 
---

## Contributing

> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine.

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request .


## FAQ

- **What is @SpringBootTest ?**
    - This annotation will load the context from main app.

---

## Support

Reach out to me If any issue !

- FaceBook at <a href="https://www.facebook.com/rajanikanta.pradhan1" target="_blank">`Rajanikanta`</a>


---


## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
