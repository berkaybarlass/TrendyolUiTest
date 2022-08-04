Feature: Trendyol Giriş Sayfasy

  Scenario: Trendyolda başarılı bir şekilde giriş yapılır.
    When Trendyol anasayfası açılır
    And Popup kapatılır
    And Giriş yap butonuna hover ile tıklanır.
    And Email dolduruldu "berkay.barlas"
    And Şifre dolduruldu ve giriş yap butonuna tıklandı
    Then Hesabım  yazısı kontrol edildi