# moleawiz_web_katalon_automation

**Step clone project langsung di katalon!!**

1. Buka katalon
2. Pada menu bagian kiri atas icon warna merah lalu klik pilih "Clone Project"
3. Masukkan kebutuhan url git,
   - URL        : https://github.com/digimaASIA/moleawiz_web_katalon_automation.git
   - User       : DigimaHafizh (bisa disesuaikan dengan akun github sendiri)
   - Token      : ghp_bKYDn1WdV1LDm7kWAZmz4rSl6QNYB50Uimo(*)B ( The token will expire on Thu, Jan 16 2025 )
4. Save Auth di ceklis
5. Klik finish

Note:
1. Katalon API Key (8d6c6d1f-e471-439b-bf6e-3ba017af67d2)
2. Token Github di perbarui setiap 1 bulan sekali


----------------------------------------
**Kebutuhan Testcase Deployment (CI/CD) !!**

***Manipulate***
 - Automation testing yang dilakukan di MoLeaWiz Web yang sudah memiliki data atau yang sudah di manipulasi

***Empty State***
 - Automation testing yang dilakukan di MoLeaWiz Web yang tidak memiliki data atau kosongan
----------------------------------------
***Login**

***1. TCML - Positive Case Login***

   - Generate TestOps CI Command:
     -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Login/Positive Case/Scenario Positive Case - Login" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
       
 ***2. TCML - Negative Case Login***
  - Generate TestOps CI Command:
      -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Login/Negative Case/Scenario Negative Case - Login" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

----------------------------------------
***Forgot Password**

***1. TCFP - Negative Case Forgot Password*** 
- Generate TestOps CI Command:
  - -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Forgot Password/Negative Case/Scenario Negative Case - Forgot Password" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

----------------------------------------
***Home**

***1. TCMH - Positive Case Home (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Home/Positive Case/Scenario Positive Case - Home (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMH - Positive Case Home (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Home/Positive Case/Scenario Positive Case - Home (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

----------------------------------------
**My Learning Journey**
 - TCMMLJ - Positive Case My Learning Journey (Empty State)
 - TCMMLJ - Positive Case My Learning Journey (Manipulate)


**Content Library**
 - TCMCL - Positive Case Content Library (Empty State)
 - TCMCL - Positive Case Content Library (Manipulate)


**Leaderboards**
 - TCMLB - Positive Case Leaderboards (Empty State)
 - TCMLB - Positive Case Leaderboards (Manipulate)


**Rewards**
 - TCMR - Positive Case Rewards (Empty State)
 - TCMR - Positive Case Rewards (Manipulate)


**Team Monitoring**
 - TCMTM - Positive Case Team Monitoring (Empty State)
 - TCMTM - Positive Case Team Monitoring (Manipulate)


**Reviews**
 - TCMR - Positive Case Review (Empty State)
 - TCMR - Positive Case Review (Manipulate)


**Help Center**
 - TCMHC - Positive Case Help Center
