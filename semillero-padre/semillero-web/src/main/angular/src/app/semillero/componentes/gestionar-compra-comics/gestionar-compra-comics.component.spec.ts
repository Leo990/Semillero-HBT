import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionarCompraComicsComponent } from './gestionar-compra-comics.component';

describe('GestionarCompraComicsComponent', () => {
  let component: GestionarCompraComicsComponent;
  let fixture: ComponentFixture<GestionarCompraComicsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GestionarCompraComicsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GestionarCompraComicsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
