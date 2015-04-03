# Generated by jeweler
# DO NOT EDIT THIS FILE DIRECTLY
# Instead, edit Jeweler::Tasks in Rakefile, and run 'rake gemspec'
# -*- encoding: utf-8 -*-
# stub: geoip 1.3.5 ruby lib

Gem::Specification.new do |s|
  s.name = "geoip"
  s.version = "1.3.5"

  s.required_rubygems_version = Gem::Requirement.new(">= 0") if s.respond_to? :required_rubygems_version=
  s.authors = ["Clifford Heath", "Roland Moriz"]
  s.date = "2013-12-20"
  s.description = "GeoIP searches a GeoIP database for a given host or IP address, and\nreturns information about the country where the IP address is allocated,\nand the city, ISP and other information, if you have that database version."
  s.email = ["clifford.heath@gmail.com", "rmoriz@gmail.com"]
  s.executables = ["geoip"]
  s.extra_rdoc_files = [
    "LICENSE",
    "README.rdoc"
  ]
  s.files = [
    "History.rdoc",
    "LICENSE",
    "README.rdoc",
    "Rakefile",
    "bin/geoip",
    "data/geoip/country_code.yml",
    "data/geoip/country_code3.yml",
    "data/geoip/country_continent.yml",
    "data/geoip/country_name.yml",
    "data/geoip/region.yml",
    "data/geoip/time_zone.yml",
    "geoip.gemspec",
    "lib/geoip.rb",
    "test/csvORG2dat.py",
    "test/organizations.csv",
    "test/organizations.dat",
    "test/test_geoip.rb",
    "test/test_helper.rb"
  ]
  s.homepage = "http://github.com/cjheath/geoip"
  s.licenses = ["LGPL"]
  s.require_paths = ["lib"]
  s.rubygems_version = "2.1.10"
  s.summary = "GeoIP searches a GeoIP database for a given host or IP address, and returns information about the country where the IP address is allocated, and the city, ISP and other information, if you have that database version."
end

