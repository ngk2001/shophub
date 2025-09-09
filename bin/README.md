# 🏪 ShopHub API

ShopHub API is a **Spring Boot RESTful API** designed for **mobile shops or gadget stores** with single or multiple branches.  
It provides role-based access for employees and managers to manage **products** and **employee records** efficiently.  

---

## 🚀 Features

- **Role-based access**
  - 👨‍💼 **Manager** → Add, update, delete products, and manage employees.  
  - 👨‍🔧 **Employee** → View product details only.
- **Branch-specific product management**
- **CRUD operations** for employees and products
- **Secured endpoints** with Spring Security
- **Database support** → PostgreSQL (cloud-hosted)

---

## 🛠️ Tech Stack

- **Backend Framework** → Spring Boot  
- **Security** → Spring Security  
- **Data Persistence** → Spring Data JPA (Hibernate)  
- **Database** → PostgreSQL (Render Cloud DB)  
- **Build Tool** → Maven  
- **Language** → Java 17  

---

## 📌 API Endpoints

### Public Endpoint
- `/shophub` → Project info (open access)

### Employee Endpoints (View-only)
- `/shophub/product/allProducts`
- `/shophub/product/serialId/{serialId}`
- `/shophub/product/category/{category}`
- `/shophub/product/brand/{brand}`
- `/shophub/product/location?branch=...&drawName=...`

### Manager Endpoints (Full Access)
- `/shophub/manager/registerEmployee`
- `/shophub/manager/allEmployees`
- `/shophub/manager/deleteEmployee/{id}`
- `/shophub/manager/modifyEmployee`
- `/shophub/manager/saveProduct`
- `/shophub/manager/update`
- `/shophub/manager/delete/{serialId}`

---

## ⚙️ Setup & Run Locally

1. Clone the repo  
   ```bash
   git clone https://github.com/ngk2001/shophub.git
   cd shophub
