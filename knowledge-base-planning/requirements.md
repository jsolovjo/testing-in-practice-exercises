# Knowledge Base Application Requirements
## Overview
The purpose of the application is to collect and keep all knowledge of the team in one place. It will keep transparency and simplicity of knowledge transfer.

The application has two implementations and can be accessed via:
- web-based application via most modern web browsers;
- desktop application and supported on most modern operating systems (Windows, macOS, RHEL/Fedora/Ubuntu/);

The application follows the tasks:
- Collect and maintain all necessary team's knowledge about technologies, products, techniques, etc;
- Knowledge transfer among team members and newcomers;
- Decrease time-consuming while searching for information;

## Functional Requirements
- Data Accessibility
  - Data is not publicly available and requires an authentication;
  - Data is available for direct system-to-system access via an HTTPS API (read only) after authentication (for web-based app);
  - System will track the date and time of last API data pull and access;
- Data Administration
   - Role-Based Access Control must be created including roles as admin, standard user, viewer; 
   - Only authorized users can create, read, update and delete only their data including profile's data and submitted tickets, topics, etc;
   - Only admin users have power to create, read, update and delete all internal data;
- User Accounts
  - User accounts are Single Sign-On protected;
  - User accounts can be created only with a work profile;
  - User account creation has to be approved by admins;
- Data Integrity
  - The application can send notifications (new tickets, updates, etc.) to users via email and pop-ups;
- System Security
  - Publicly and externally not available;
  - Work VPN usage is required to access the application and data;
  - API provides only read-only data access;

## Features
- Role-Based Access Control;
  - User creation, modification, deletion and administration;
- Search engine for any kind of information within the application;
- Entry, reading, modification and deletion of information (tickets, replies, topics, comments, etc.);
- Export information using multiple formats;
- Internal messenger for users;
- Manageable notifications when any event happened (new ticket, mention, reply, etc.);

## System Requirements
- Web-based Application
  - Web browser support:
    - Google Chrome 99+
    - Mozilla Firefox 98+
    - Safari 15+
- Desktop application
  - Operating System support:
    - Windows 8.1, Windows 10, Windows 11
    - macOS Catalina
    - Ubuntu 20.04, RHEL8, Fedora 35 (Chrome 99+)
