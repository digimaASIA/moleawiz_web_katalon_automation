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
***My Learning Journey**

***1. TCMMLJ - Positive Case My Learning Journey (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/My Learning Journey/Positive Case/Scenario Positive Case - My Learning Journey (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMMLJ - Positive Case My Learning Journey (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/My Learning Journey/Positive Case/Scenario Positive Case - My Learning Journey (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

-----------------------------------------
***Content Library**

***1. TCMCL - Positive Case Content Library (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Content Library/Positive Case/Scenario Positive Case - Content Library (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMCL - Positive Case Content Library (Manipulate)***
- Generate Testops CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Content Library/Positive Case/Scenario Positive Case - Content Library (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

------------------------------------------
***Leaderboards**

***1. TCMLB - Positive Case Leaderboards (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Leaderboards/Positive Case/Scenario Positive Case - Leaderboards (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMLB - Positive Case Leaderboards (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Leaderboards/Positive Case/Scenario Positive Case - Leaderboards (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

-------------------------------------------
***Rewards**

***1. TCMR - Positive Case Rewards (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Rewards/Positive Case/Scenario Positive Case - Rewards (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMR - Positive Case Rewards (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Rewards/Positive Case/Scenario Positive Case - Rewards (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

-------------------------------------------
***Team Monitoring**

***1. TCMTM - Positive Case Team Monitoring (Empty State)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Team Monitoring/Positive Case/Scenario Positive Case - Team Monitoring (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMTM - Positive Case Team Monitoring (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Team Monitoring/Positive Case/Scenario Positive Case - Team Monitoring (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

-------------------------------------------
***Reviews**

***1. TCMR - Positive Case Review (Empty State)*** 
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Review/Positive Case/Scenario Positive Case - Review (Empty State)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

***2. TCMR - Positive Case Review (Manipulate)***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Review/Positive Case/Scenario Positive Case - Review (Manipulate)" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true

-------------------------------------------
***Help Center**

***1. TCMHC - Positive Case Help Center***
- Generate TestOps CI Command:
  -  -retry=0 -testSuitePath="Test Suites/MoLeaWiz/Help Center/Positive Case/Scenario Postive Case - Help" -browserType="Chrome" -executionProfile="default" -testOpsProjectId=1746395 --config -proxy.auth.option=NO_PROXY -proxy.system.option=NO_PROXY -proxy.system.applyToDesiredCapabilities=true -webui.autoUpdateDrivers=true
